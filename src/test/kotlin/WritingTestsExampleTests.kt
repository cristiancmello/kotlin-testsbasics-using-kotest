import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class WritingTestsExampleTests : FunSpec ({
    test("my first test") {
        1 + 3 shouldBe 4
    }
})