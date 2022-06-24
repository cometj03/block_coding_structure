fun startBlock(block: StartBlock.() -> Unit): StartBlock {
    val start = StartBlock()
    start.block()
    return start
}

fun BlockHolder.printBlock(msg: String) {
    val codeBlock = PrintBlock(msg)
    addCodeBlock(codeBlock)
}

fun BlockHolder.ifBlock(
    condition: Boolean,
    scope: IfBlock.() -> Unit
) {
    val codeBlock = IfBlock(condition)
    codeBlock.scope()
    addCodeBlock(codeBlock)
}