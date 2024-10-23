public class MissingNumber {

    public static int findMissing(int[] arr, int n) {
        // Вычисляем ожидаемую сумму чисел от 1 до n
        int expectedSum = n * (n + 1) / 2;

        // Вычисляем фактическую сумму элементов массива
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Разница между ожидаемой и фактической суммой - это недостающий элемент
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        System.out.println(findMissing(arr1, 5)); // Вывод: 4

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        System.out.println(findMissing(arr2, 10)); // Вывод: 9
        String[] arr = {"id", "1", "country", "Finland", "city", "Helsinki", "year", null};

        StringBuilder sb = new StringBuilder("SELECT * FROM cars");
        boolean paramExists = false;

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i + 1] != null) {
                if (!paramExists) {
                    sb.append(" WHERE");
                    paramExists = true;
                } else {
                    sb.append(" AND");
                }
                sb.append(" ")
                        .append(arr[i])
                        .append(" = '")
                        .append(arr[i + 1])
                        .append("'");
            }
        }

        sb.append(";");

        System.out.println(sb);
    }



    }




