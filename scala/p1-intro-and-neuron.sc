val inputs: Vector[Double] = Vector(1.2, 5.1, 2.1)
val weights: Vector[Double] = Vector(3.1, 2.1, 8.7)
val bias: Double = 3

val output = List(
  inputs(0) * weights(0),
  inputs(1) * weights(1),
  inputs(2) * weights(2),
  bias
).sum

println(output)