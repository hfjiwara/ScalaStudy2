object ReturnApp {
  def main(array: Array[String], target: String): Int = {
    var index = -1
    var found = false
    var i = 0
    while (i < array.length && !found) {
      if (array(i) == target) {
        index = i
        found = true
      }
      i += 1
    }
    index
  }
}