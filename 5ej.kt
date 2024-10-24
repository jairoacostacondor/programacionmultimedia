fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if(hobby != null) {
            print("$name likes to $hobby. ")
        }
        if(referrer != null) {
            print("Tiene un referrer llamd@ ${referrer.name}")
            if(referrer.hobby != null) {
                print("y le gusta ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("No tiene referrer.")
        }
        print("\n\n")
    }
}