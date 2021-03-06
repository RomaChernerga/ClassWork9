package HomeWork9;

public class HW9_main {
    // 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо
    // числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
    // и MyArrayDataException и вывести результат расчета.
    public static void main(String[] args){
        String[][] arr1 =  {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"12", "14", "15", "16"}
        };

        try{
            System.out.println("Начало проверки");
            Method.sum(arr1);
            System.out.println("Окончание проверки");
        } catch (MyArraySizeException | MyArrayDataException  exception) {
            exception.printStackTrace();  //при наличии исключения, вывести его
        }

    }
}
