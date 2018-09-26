import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArithmetic {

    public int count = 0;
    /*
        零售价 50元
        成本价 30元

     */

    @Test
    public void test1() {
        //各奖项对应商品金额
        int[] awardPrice = {10, 15, 20, 25, 30};
        //奖品数量
        int goodsSize = 50;
        double[] awardPercent = {0.1, 0.15, 0.2, 0.25, 0.3};

        int arr[] = {0, 0, 0, 0, 0};
        Integer count = 0;
        List<int[]> list = new ArrayList<>();
        list = cal(awardPercent, 0, arr, goodsSize, goodsSize * 25, awardPrice, list);

        System.out.println("ojbk,共循环了：" + count + " 次,符合要求的共：" + list.size() + " 条！");
        int[] good = good(list, awardPercent, goodsSize);

        System.out.println("最优方案为：" + Arrays.toString(good));
    }

    public int[] good(List<int[]> list, double[] awardPercent, int goodsSize) {
        int[] arr = new int[awardPercent.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (awardPercent[i] * goodsSize);
        }
        arr[arr.length - 1] = goodsSize - (counts(arr) - arr[arr.length - 1]);
        return arr;
    }

    @Test
    public void jttl() {
        int Cock, Hen, Chick; /*定义公鸡，母鸡，鸡雏三个变量*/
        Cock = 0;

        /*公鸡最多不可能大于19*/
        while (Cock <= 19) {
            Hen = 0;
            /*母鸡最多不可能大于33*/
            while (Hen <= 33) {
                Chick = 100 - Cock - Hen;
                if (Cock * 15 + Hen * 9 + Chick == 300) {
                    /*为了方便，将数量放大三倍比较*/
                    System.out.println(StrUtil.format("\n公鸡={}\n母鸡={}\n雏鸡={}", Cock, Hen, Chick));
                }
                Hen = Hen + 1;
            }
            Cock = Cock + 1;
        }
    }


    public List<int[]> cal(double[] percent, int index, int[] arr, int total, int cost, int[] costs, List<int[]> list) {
        int present = 1;
        boolean flag = true;
        while (arr[index] * present <= percent[index] * total) {
            count += 1;
            if (index < arr.length - 1) {
                arr[index] = present++;
                //present += 1;
                list = cal(percent, index + 1, arr, total, cost, costs, list);
                arr[index] = 1;
            } else if (index == arr.length - 1) {
//                System.out.println(counts(arr));
//                arr[index] = total - counts(arr);
//                flag = false;
                break;
            }
        }

        if (flag) {
            arr[arr.length - 1] = total - (counts(arr) - arr[arr.length - 1]);
        }
        if (calTotalPrice(arr, costs) > cost && check(arr, index)) {
            list.add(arr);
            System.out.println("符合的结果：" + Arrays.toString(arr) + " ===== " + calTotalPrice(arr, costs));
        }
        // System.out.println(Arrays.toString(arr));

        return list;
    }

    private int calTotalPrice(int[] arr, int[] percent) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            //if(arr[i] != null && arr[i] != 0){
            result = result + arr[i] * percent[i];
            //}
        }
        return result;
    }

    private boolean check(int[] arr, int index) {
        for (int i = 1; i <= index; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private int counts(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            //if(arr[i] != null && arr[i] != 0){
            result = result + arr[i];
            // }
        }
        return result;
    }


    @Test
    public void calculatorAge() {
        DateTime startDate = DateUtil.beginOfDay(DateUtil.date());
        DateTime endDate = startDate;
        for (int i = 0; i < 7; i++) {
            startDate = DateUtil.offset(startDate, DateField.YEAR, -1);
            endDate = DateUtil.endOfDay(startDate);
            System.out.println(startDate +"  --  "+ endDate);


        }
        //System.out.println(DateUtil.age(DateUtil.parse("2014-08-03 23:59:59"),DateUtil.date()));
    }


}
