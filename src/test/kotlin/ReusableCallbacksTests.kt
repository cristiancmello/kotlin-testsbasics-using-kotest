import io.kotest.core.spec.BeforeTest
import io.kotest.core.spec.style.FunSpec

val resetDatabase : BeforeTest = {
    println("Reset database: truncate all tables")
}

class ReusableCallbacksTests : FunSpec ({
    beforeTest(resetDatabase)

    test ("this test will have a sparkling clean database!") {
        // TODO: test here
    }
})