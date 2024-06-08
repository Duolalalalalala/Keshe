package algorithms;

public class FCFS {
    private int n; // 磁盘请求数目
    private int[] request; // 磁盘请求序列
    private int head; // 磁头初始位置

    public FCFS(int n, int[] request, int head) {
        this.n = n;
        this.request = request;
        this.head = head;
    }

    public int schedule() {
        int distance = 0; // 磁头移动距离
        int seekTime = 0; // 磁头寻道总距离
        System.out.println("FCFS算法调度过程如下：");
        for (int i = 0; i < n; i++) {
            distance = Math.abs(request[i] - head); // 计算磁头移动距离
            seekTime += distance; // 累加磁头寻道距离
            System.out.println("从" + head + "号磁道移动到" + request[i] + "号磁道，移动距离为" + distance);
            head = request[i]; // 更新磁头位置
        }
        System.out.println("FCFS算法调度结束");
        System.out.println("总移动距离为：" + seekTime);
        System.out.println("平均寻道长度为：" + (double)seekTime / n);
        return seekTime;
    }
}
