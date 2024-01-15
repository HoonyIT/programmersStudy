import java.util.*;
class song implements Comparable<song>{
    String genres;
    int index, play, sum;
    public song(String g, int i, int p, int s){
        this.genres = g;
        this.index = i;
        this.play = p;
        this.sum = s;
    }
    @Override
    public int compareTo(song s){
        if(this.sum==s.sum && this.genres.equals(s.genres) && this.play==s.play) return this.index-s.index;
        else if(this.sum==s.sum && this.genres.equals(s.genres)) return s.play-this.play;
        else if(this.sum==s.sum) return this.genres.compareTo(s.genres);
        else return s.sum-this.sum;
    }
}

class Solution {
    public ArrayList<Integer> solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<song> list = new ArrayList<>();
        
        for(int i=0; i<plays.length; i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        
        for(int i=0; i<plays.length; i++){
            list.add(new song(genres[i],i,plays[i],map.get(genres[i])));
        }
        Collections.sort(list);
        map.clear();
        
        for(int i=0; i<list.size(); i++){
            // System.out.println(list.get(i).genres + "," + list.get(i).index + "," + list.get(i).play + "," + list.get(i).sum);
            map.put(list.get(i).genres,map.getOrDefault(list.get(i).genres,0)+1);
            if(map.get(list.get(i).genres)>2) continue;
            else answer.add(list.get(i).index);
        }

        return answer;
    }
}