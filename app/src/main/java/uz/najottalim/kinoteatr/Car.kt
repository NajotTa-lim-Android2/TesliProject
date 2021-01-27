package uz.najottalim.kinoteatr

class Car {

    fun sellCar(year: Int, price: Int){

    }

    var title: String = ""
    var price: Int = 1000
        get() {
            return field
        }
        set(value) {
            if (value > 0) {
                field = value
            }
        }

}