package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {

        val x = 10
        val y = 0
        val z = x / y

        println(z)


    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan: ${e.message}")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Exception handling selesai.")
    }
}
