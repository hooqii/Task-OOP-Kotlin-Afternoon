package excercise5

class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0
    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan(count: Int) {
        checkHealth()
        println("$name sedang berjalan ${count}x [Health -${1*count}]")
        health -= 1*count
        profile()
    }

    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
    - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
    - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
    - ubah nilai variable health sesuai kegiatan yang dilakukan:
     * lari = -2
     * makan = +2
     * minum = +2
     * lompat = -2
     * duduk = +1

    Contoh fungsi bisa mengikuti fungsi jalan() diatas.
     */

    fun lari(count: Int) {
        checkHealth()
        println("$name sedang berlari ${count}x [Health -${2*count}]")
        health -= 2*count
        profile()
    }

    fun makan(count: Int) {
        checkHealth()
        println("$name sedang makan ${count}x [Health +${2*count}]")
        health += 2*count
        profile()
    }

    fun minum(count: Int) {
        checkHealth()
        println("$name sedang minum ${count}x [Health +${2*count}]")
        health += 2*count
        profile()
    }

    fun lompat(count: Int) {
        checkHealth()
        println("$name sedang lompat ${count}x [Health -${2*count}]")
        health -= 2*count
        profile()
    }

    fun duduk(count: Int) {
        checkHealth()
        println("$name sedang duduk ${count}x [Health +${1*count}]")
        health += 1*count
        profile()
    }
}

