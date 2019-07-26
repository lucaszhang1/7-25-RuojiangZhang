class Fox: Canine(){
    override val image = "fox.jpg"
    override val food = "meat"
    override val habitat = "jungle"

    override fun eat() {
        println("The Fox is eating. ")
    }

    override fun makeNoise() {
        println("Aux! ")
    }
}