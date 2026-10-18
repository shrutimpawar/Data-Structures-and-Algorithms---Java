
import java.util.*;

public class TaskDispacther {

    static class Server{

        long load ;
        int id;
        int k;

        Server(long load,int id,int k){

            this.load = load;
            this.id = id;
            this.k = k;

        }
    }

    public static long taskDispacther(int N,int M,long W,long base[]){

        Integer order[] = new Integer[N];
        for(int i = 0;i < N;i++){
            order[i] = i;
        }

        Arrays.sort(order,(a,b)->{

            if(base[a] != base[b]){
                return Long.compare(base[b],base[a]);
            }
            return Integer.compare(a,b);
        });

        PriorityQueue<Server>pq = new PriorityQueue<>((a,b) ->{
            if(a.load != b.load){
                return Long.compare(a.load, b.load);
            }
            return Integer.compare(a.id,b.id);
        });

        for(int i = 0;i < M;i++){
            pq.offer(new Server(0, i, 0));
        }

        for(int i = 0; i < N;i++){

            Server server = pq.poll();
            long task = base[order[i]];
            long load = server.load + task + (long)server.k * W;

            pq.offer(new Server(load,server.id,server.k + 1));

        }

        long ans = 0;
        while(!pq.isEmpty()){

            Server server = pq.poll();
            ans = Math.max(ans,server.load);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of tasks (N):");
        int N = sc.nextInt();

        System.out.println("Enter number of servers (M):");
        int M = sc.nextInt();

        System.out.println("Enter waiting penalty (W):");
        long W = sc.nextLong();

        long[] base = new long[N];

        System.out.println("Enter base load of each task:");
        for (int i = 0; i < N; i++) {
            base[i] = sc.nextLong();
        }

        long ans = taskDispacther(N, M, W, base);

        System.out.println("Minimum maximum server load: " + ans);

        sc.close();
    }
    
}
