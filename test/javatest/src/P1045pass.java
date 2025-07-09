import java.math.BigInteger;
import java.io.*;

public class P1045pass {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 读取输入的 p 值
        int p = Integer.parseInt(bf.readLine());

        // 计算 2^p - 1
        BigInteger two = new BigInteger("2");
        BigInteger one = BigInteger.ONE;
        BigInteger result = two.pow(p).subtract(one);

        // 将结果转换为字符串
        String resultStr = result.toString();

        // 输出结果的位数
        bw.write(resultStr.length() + "\n");

        // 输出最后 500 位数字
        if (resultStr.length() >= 500) {
            // 如果结果长度大于或等于 500，截取最后 500 位
            resultStr = resultStr.substring(resultStr.length() - 500);
        } else {
            // 如果结果长度小于 500，前面补零
            int paddingLength = 500 - resultStr.length();
            StringBuilder paddedResult = new StringBuilder();
            for (int i = 0; i < paddingLength; i++) {
                paddedResult.append('0');
            }
            paddedResult.append(resultStr);
            resultStr = paddedResult.toString();
        }

        // 每 50 个字符换行一次
        for (int i = 0; i < resultStr.length(); i++) {
            bw.write(resultStr.charAt(i));
            if ((i + 1) % 50 == 0) {
                bw.write("\n");
            }
        }

        // 关闭流
        bw.flush();
        bf.close();
        bw.close();
    }
}