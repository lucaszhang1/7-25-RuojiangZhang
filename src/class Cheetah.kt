class Cheetah: Feline(){
    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "prairie"

    override fun eat() {
        println("The Cheetah is eating. ")
    }

    override fun makeNoise() {
        println("Qiqi! ")
    }
}