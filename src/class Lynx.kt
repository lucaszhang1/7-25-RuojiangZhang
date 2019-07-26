class Lynx: Feline(){
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "mountains"

    override fun eat() {
        println("The Lynx is eating. ")
    }

    override fun makeNoise() {
        println("Miao! ")
    }
}