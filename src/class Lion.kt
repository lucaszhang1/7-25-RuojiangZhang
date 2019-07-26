class Lion: Feline(){
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "prairie"

    override fun eat() {
        println("The Lion is eating. ")
    }

    override fun makeNoise() {
        println("Hoo! ")
    }
}