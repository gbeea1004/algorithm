package programmers.q172928;

public class Solution {

  private static final String START = "S";

  public int[] solution(String[] park, String[] routes) {
    String[][] parks = toParks(park);
    int[] position = getStartPosition(parks);

    for (String route : routes) {
      Direction direction = Direction.valueOf(getDirection(route));
      final int distance = getDistance(route);

      if (direction.canGo(position[0], position[1], parks, distance)) {
        position[0] += direction.getX(distance);
        position[1] += direction.getY(distance);
      }
    }

    return position;
  }

  private String[][] toParks(String[] park) {
    String[][] result = new String[park.length][park[0].split("").length];
    for (int i = 0; i < result.length; i++) {
      String[] line = park[i].split("");
      for (int j = 0; j < result[0].length; j++) {
        result[i][j] = line[j];
      }
    }
    return result;
  }

  private int[] getStartPosition(String[][] parks) {
    for (int i = 0; i < parks.length; i++) {
      for (int j = 0; j < parks[0].length; j++) {
        if (parks[i][j].equals(START)) {
          return new int[]{i, j};
        }
      }
    }

    throw new IllegalArgumentException();
  }

  private String getDirection(String route) {
    return route.split(" ")[0];
  }

  private int getDistance(String route) {
    return Integer.parseInt(route.split(" ")[1]);
  }
}

enum Direction {
  E(0, 1) {
    @Override
    boolean canGo(int startX, int startY, String[][] parks, int move) {
      int nextY = startY + move;
      if (nextY >= parks[0].length) {
        return false;
      }

      for (int i = startY; i <= nextY; i++) {
        if (parks[startX][i].equals("X")) {
          return false;
        }
      }

      return true;
    }
  },
  W(0, -1) {
    @Override
    boolean canGo(int startX, int startY, String[][] parks, int move) {
      int nextY = startY - move;
      if (nextY < 0) {
        return false;
      }

      for (int i = startY; i >= nextY; i--) {
        if (parks[startX][i].equals("X")) {
          return false;
        }
      }

      return true;
    }
  },
  S(1, 0) {
    @Override
    boolean canGo(int startX, int startY, String[][] parks, int move) {
      int nextX = startX + move;
      if (nextX >= parks.length) {
        return false;
      }

      for (int i = startX; i <= nextX; i++) {
        if (parks[i][startY].equals("X")) {
          return false;
        }
      }

      return true;
    }
  },
  N(-1, 0) {
    @Override
    boolean canGo(int startX, int startY, String[][] parks, int move) {
      int nextX = startX - move;
      if (nextX < 0) {
        return false;
      }

      for (int i = startX; i >= nextX; i--) {
        if (parks[i][startY].equals("X")) {
          return false;
        }
      }

      return true;
    }
  },
  ;

  private final int x;
  private final int y;

  Direction(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX(int move) {
    return x * move;
  }

  public int getY(int move) {
    return y * move;
  }

  abstract boolean canGo(int startX, int startY, String[][] parks, int move);
}
