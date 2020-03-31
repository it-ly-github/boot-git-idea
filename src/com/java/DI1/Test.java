package com.java.DI1;

/**
 * @author Ly
 * @date 2020/3/22 -15:45
 */
public class Test {

//    public static void main(String[] args) {
//        // jdk 8 新增三个操作时间的类 localDate 、localTime、LocalDateTime 、DateTimeFormatter、Duration、Period 都是线程安全的
//        // 获取日期
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//
//        // 获取时间
//        LocalTime time = LocalTime.now();
//        System.out.println("time = " + time);
//
//        // 获取日期和时间
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("localDateTime = " + localDateTime);
//
//
//        // ---------------------------------------------------------
//        // 获取时间戳 到毫秒
//        long toEpochMilli = Instant.now().toEpochMilli();
//        System.out.println("toEpochMilli = " + toEpochMilli);
//
//        // 获取时间戳 到秒
//        long epochSecond = Instant.now().getEpochSecond();
//        System.out.println("epochSecond = " + epochSecond);
//
//        // ------------时间格式化------------------------------------------
//        DateTimeFormatter dateTimeF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String time2 = dateTimeF.format(localDateTime.now());
//        System.out.println("time2 = " + time2);
//
//        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        System.out.println("format = " + format);
//
//        String time3 = "2020-03-22 16:05:01";
//        LocalDateTime parse = LocalDateTime.parse(time3, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        System.out.println("parse = " + parse);
//
//        LocalDateTime localDateTime1 = LocalDateTime.now().minusDays(-1);
//
//        System.out.println(localDateTime1);
//
//        // ---------获取当前时间有几中方式
//        Date date = new Date();
//        System.out.println("date = " + date);
//
//        Date time1 = Calendar.getInstance().getTime();
//        System.out.println(time1);
//
//        LocalDateTime.now();
//
//        // 获取昨天此刻的方法
//        Calendar.getInstance().add(Calendar.DATE,-1);
//        LocalDateTime.now().plusDays(-1);
//
//        int[] arr = new int[5];
//        int[] arr2 = new int[]{};
//        int[] arr3 = {1,2,3};
//
//
//    }

//    public static void main(String[] args) {
//        // 冒泡排序
//        int[] arr = {2,4,9,16,11,7};
//        System.out.println("排序前="+ Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            // 因为冒泡是把每轮循环中最大的值飘到后面  所以是 arr.length - i - 1
//            for (int j = 0; j <arr.length-i-1; j++) {
//                // 前一个数 arr[j] ; 后一个数 arr[j + 1]
//                if (arr[j] > arr[j + 1]){
//                    // 元素交换
//                    int temp = arr[j + 1]; // 将较小的数赋给一个变量temp
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("排序后"+Arrays.toString(arr));
//    }


//    public static void main(String[] args) {
//        // 冒泡排序
//        int[] arr = {11,2,15,7,9,20};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i -1; j++) {
//                // 若前一个数大于后一个数，则交换位置
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//
//        }
//        System.out.println("冒泡后的结果="+ Arrays.toString(arr));
//    }


    public static void main(String[] args) {
//        String[] arr = {"dog","cat","pig","bird"};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        // 查找数组是否包含某个值
//        int i = Arrays.binarySearch(arr, "bird");
//        System.out.println(i);

//        int[] arr = new int[10];
//        Arrays.fill(arr,2,5,6);
//        System.out.println(Arrays.toString(arr));
        String str1 = "Hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);
    }


}
