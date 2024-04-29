public boolean hasPath(int n, int[][] edges, int source, int destination) {
    //visited
    if(src==dest){
        return true;
    }
    vis[src] = true;
    for(int i = 0;i<graph[src].size();i++){
        Edge e = graph[src].get(i);
        //e.dest = neighbour
        if(!vis[e.dest]&& hasPath(graph,e.dest,dest,vis)){
            return true;
        }
    }
    return false;
}