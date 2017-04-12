package RPG;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Character extends GameObject {

  int tileSize = 72;
  int random[] = new int[2];


  public Character() {

  }

  public void moveUp() {
    this.posY -= tileSize;
    setImage(ImageLoader.getInstance().HERO_UP);
  }

  public void moveDown() {
    this.posY += tileSize;
    setImage(ImageLoader.getInstance().HERO_DOWN);
  }

  public void moveLeft() {
    this.posX -= tileSize;
    setImage(ImageLoader.getInstance().HERO_LEFT);
  }

  public void moveRight() {
    this.posX += tileSize;
    setImage(ImageLoader.getInstance().HERO_RIGHT);
  }

  public int[] randomPosition() {
    Tiles.readBoard();
    random[0] = random[1] = -1;
    while (isWall(random[0], random[1])) {
      random[0] = (int) (Math.random() * 10);
      random[1] = (int) (Math.random() * 10);
    }
    random[0] *= tileSize;
    random[1] *= tileSize;
      return random;
    }
  }

