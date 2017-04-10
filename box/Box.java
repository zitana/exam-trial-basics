public class Cuboid {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume
  int length;
  int width;
  int height;
  
  Cuboid (int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }
  
  public int getSurface() {
    return 2 * (this.length * this.width + this.length * this.height + this.width * this.height)
  }

  public int getVolume() {
    return this.length * this.width * this.height;
  }
}
