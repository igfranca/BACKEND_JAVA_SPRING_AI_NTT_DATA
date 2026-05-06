package dio.java.interfaces.inter1;

public class Main {
  public static void main(String[] args) {

    var musicPlayer = new MusicPlayer() {

      @Override
      public void playMusic() {
        System.out.println("Playing music");
      }

      @Override
      public void pauseMusic() {
        System.out.println("Pausing music");
      }

      @Override
      public void stopMusic() {
        System.out.println("Stopping music");
      }
    };
    musicPlayer.playMusic();

  }
}
