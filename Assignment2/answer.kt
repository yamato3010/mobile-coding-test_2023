fun main(args: Array<String>) {
  // 入力されたコマンドライン引数が1つ以上で、その1つ目が整数で、かつ、その整数が10未満の場合
  if (args.isNotEmpty() && args[0].toIntOrNull() != null && (args[0].toInt() / 10) < 1.0) {
    val N = args[0]
    for(i in 1..N.toInt()) {
      for (j in 1..N.toInt()-i) {
        print(" ")
      }
      for (j in 1..i) {
        print(j)
      }
      for (j in i-1 downTo 1) {
        print(j)
      }
      println("")
    }
  } else {
    println("usage: answer.jar N (N < 10)")
  }
}