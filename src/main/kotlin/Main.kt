fun main(args: Array<String>) {
    startBlock {
        printBlock("hello")
        ifBlock(2 < 1) {
            printBlock("2 is grater than 1")
            printBlock("this is last of if-block")
        }
        printBlock("finished if-block")
    }.execute()
}