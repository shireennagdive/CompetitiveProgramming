import java.util.List;

class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if(rooms.size()==0) return true;
        boolean[] visited = new boolean[rooms.size()];
        visited[0]=true;
        enterRoom(rooms.get(0),visited,rooms);
        for(boolean visit : visited){
            if(!visit) return false;
        }
        return true;
    }
    public void enterRoom(List<Integer> keys, boolean[] visited,List<List<Integer>> rooms){
        for(int key : keys){
            if(!visited[key]){
                visited[key] = true;
                enterRoom(rooms.get(key),visited,rooms);
            }
        }
    }
}