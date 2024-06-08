package algorithms;

public class SSTF {
    private int n; // 磁盘请求数目
    private int[] request; // 磁盘请求序列
    private int head; // 磁头初始位置
    private boolean[] visited; // 标记请求是否已被处理

    public SSTF(int n, int[] request, int head) {
        this.n = n;
        this.request = request;
        this.head = head;
        this.visited = new boolean[n]; // 创建动态布尔数组
        for (int i = 0; i < n; i++) {
            visited[i] = false; // 初始化为未访问
        }
    }

    public int schedule() {
        int distance = 0; // 磁头移动距离
        int seekTime = 0; // 磁头寻道总距离
        System.out.println("SSTF算法调度过程如下：");
        for (int i = 0; i < n; i++) {
            int minDistance = Integer.MAX_VALUE; // 最小寻道距离，初始为最大整数
            int minIndex = -1; // 最小寻道距离对应的请求序号，初始为-1
            for (int j = 0; j < n; j++) {
                if (!visited[j]) { // 如果请求未被处理
                    distance = Math.abs(request[j] - head); // 计算磁头移动距离
                    if (distance < minDistance) { // 如果距离小于当前最小距离
                        minDistance = distance; // 更新最小距离
                        minIndex = j; // 更新最小距离对应的序号
                    }
                }
            }
            seekTime += minDistance; // 累加磁头寻道距离
            System.out.println("从" + head + "号磁道移动到" + request[minIndex] + "号磁道，移动距离为" + minDistance);
            head = request[minIndex]; // 更新磁头位置
            visited[minIndex] = true; // 标记请求已被处理
        }
        System.out.println("SSTF算法调度结束");
        System.out.println("总移动距离为：" + seekTime);
        System.out.println("平均寻道长度为：" + (double)seekTime / n);
        return seekTime;
    }
}
