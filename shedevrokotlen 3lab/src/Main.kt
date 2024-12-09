// Класс Movement
class Movement(private val speed: Double, private val timeMinutes: Int) {

    // Конструктор с проверкой корректности входных данных
    init {
        require(speed >= 0) { "Скорость должна быть неотрицательной" }
        require(timeMinutes >= 0) { "Время должно быть неотрицательным" }
    }

    // Метод для формирования строки с информацией об объекте
    fun getInfo(): String {
        return "Скорость: $speed м/с, Время: $timeMinutes минут"
    }

    // Метод для вычисления пройденного расстояния
    fun calculateDistance(): Double {
        val timeSeconds = timeMinutes * 60 // Перевод минут в секунды
        return speed * timeSeconds
    }
}

fun main() {
    try {
        // Ввод значений через консоль
        println("Введите скорость движения (м/с):")
        val speed = readln().toDouble()

        println("Введите время движения (в минутах):")
        val timeMinutes = readln().toInt()

        //объект класса Movement
        val movement = Movement(speed, timeMinutes)

        //инфа об объекте
        val info = movement.getInfo()

        //пройденное расстояние
        val distance = movement.calculateDistance()

        // Вывод результатов
        println(info)
        println("Пройденное расстояние: $distance метров")

    } catch (e: Exception) {
        // Обработка ошибок ввода
        println("Ошибка: ${e.message}")
    }
}
