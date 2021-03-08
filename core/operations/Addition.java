package core.operations;

public class Addition implements Operation{
    
    /**
    * <p>Проверяет, допустимый ли ход.</p>
    * <p>Например, чтобы задать ход e2-e4, напишите isValidMove(5,2,5,4);
    * Чтобы записать рокировку, укажите, откуда и куда ходит король.
    * Например, для короткой рокировки чёрных запишите isValidMove(5,8,7,8);</p>
    *
    * @param firstValue Первое слагаемое
    * @param secondValue Второе слагаемое
    * @return Результат сложения
    */
    
    @Override
    public double getResult(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
