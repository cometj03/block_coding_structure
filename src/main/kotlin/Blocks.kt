interface Block {
    fun execute()
}

open class BlockHolder : Block {
    private val children = mutableListOf<Block>()
    fun addCodeBlock(block: Block) {
        children.add(block)
    }

    override fun execute() {
        children.forEach { it.execute() }
    }
}

class StartBlock : BlockHolder()

class PrintBlock(private val msg: String) : Block {
    override fun execute() {
        println(msg)
    }
}

class IfBlock(private val condition: Boolean) : BlockHolder() {
    override fun execute() {
        if (condition)
            super.execute()
    }
}