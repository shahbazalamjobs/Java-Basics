class Main {

    public static String printRevString(String str) {
        if (str == null) {
            return null;
        }

        char[] stringArr = str.toCharArray();

        int left = 0;
        int right = stringArr.length - 1;

        while (left < right) {
            char temp = stringArr[left];
            stringArr[left] = stringArr[right];
            stringArr[right] = temp;

            left++;
            right--;
        }

        return new String(stringArr);
    }

    public static void main(String[] arr) {
        String revString = printRevString("sonu");
        System.out.println(revString);
    }
}
