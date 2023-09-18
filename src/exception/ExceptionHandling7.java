package exception;

public class ExceptionHandling7 {
    public static int findNumber(int[] arr, int input) {

        if (input > 5) {
            throw new ArrayIndexOutOfBoundsException(" The input is larger than array size");
        } else {
            return arr[input];
        }
    }
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int input = 1;
            System.out.println(findNumber(arr,input));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
        NullPointerException: Bir nesnenin null olduğu bir yerde erişilmeye çalışıldığında fırlatılan bir hata türüdür.
        ArrayIndexOutOfBoundsException: Bir dizi (array) elemanına geçerli olmayan bir indeksle erişildiğinde fırlatılan bir hata türüdür.
        ArithmeticException: Aritmetik işlemlerde hata olduğunda fırlatılan bir hata türüdür (örneğin, bir sayıyı sıfıra bölmeye çalışmak).
        IllegalArgumentException: Bir metodun yanlış veya geçersiz argümanlarla çağrıldığında fırlatılan bir hata türüdür.*/
