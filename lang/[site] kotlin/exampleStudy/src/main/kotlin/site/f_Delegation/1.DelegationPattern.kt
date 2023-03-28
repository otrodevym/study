package site.f_Delegation

interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(val n: String) : SoundBehavior {
    override fun makeSound() = println("${n.uppercase()}!!!")
}

class RockAndRollBehavior(val n: String) : SoundBehavior {
    override fun makeSound() = println("I'm TheKing of Rock 'N' Roll: $n")
}

class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n:String): SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tomAraya = TomAraya("Threash Metal")
    tomAraya.makeSound()
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}