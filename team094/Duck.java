// Typing for the duck in you.
// Sort of an extension to Msg, but just types.
package team094;
import java.util.*;
import battlecode.common.*;

class Duck {
    static final Direction[] directions = {
        Direction.NORTH,
        Direction.NORTH_EAST,
        Direction.EAST,
        Direction.SOUTH_EAST,
        Direction.SOUTH,
        Direction.SOUTH_WEST,
        Direction.WEST,
        Direction.NORTH_WEST
    };
    static final RobotType[] rt = {
        RobotType.AEROSPACELAB,
        RobotType.BARRACKS,
        RobotType.BASHER,
        RobotType.BEAVER,
        RobotType.COMMANDER,
        RobotType.COMPUTER,
        RobotType.DRONE,
        RobotType.HANDWASHSTATION,
        RobotType.HELIPAD,
        RobotType.HQ,
        RobotType.LAUNCHER,
        RobotType.MINER,
        RobotType.MINERFACTORY,
        RobotType.MISSILE,
        RobotType.SOLDIER,
        RobotType.SUPPLYDEPOT,
        RobotType.TANK,
        RobotType.TANKFACTORY,
        RobotType.TECHNOLOGYINSTITUTE,
        RobotType.TOWER,
        RobotType.TRAININGFIELD,
    };

    public static ArrayList<Integer> val2al(int i) {
        ArrayList<Integer> tmp = new ArrayList<Integer>(1);
        tmp.add(i);
        return tmp;
    }
    public static ArrayList<Integer> val2al(RobotType type) {
        final int typeval;
        switch(type) {
            case AEROSPACELAB:
                typeval = 0;
                break;
            case BARRACKS:
                typeval = 1;
                break;
            case BASHER:
                typeval = 2;
                break;
            case BEAVER:
                typeval = 3;
                break;
            case COMMANDER:
                typeval = 4;
                break;
            case COMPUTER:
                typeval = 5;
                break;
            case DRONE:
                typeval = 6;
                break;
            case HANDWASHSTATION:
                typeval = 7;
                break;
            case HELIPAD:
                typeval = 8;
                break;
            case HQ:
                typeval = 9;
                break;
            case LAUNCHER:
                typeval = 10;
                break;
            case MINER:
                typeval = 11;
                break;
            case MINERFACTORY:
                typeval = 12;
                break;
            case MISSILE:
                typeval = 13;
                break;
            case SOLDIER:
                typeval = 14;
                break;
            case SUPPLYDEPOT:
                typeval = 15;
                break;
            case TANK:
                typeval = 16;
                break;
            case TANKFACTORY:
                typeval = 17;
                break;
            case TECHNOLOGYINSTITUTE:
                typeval = 18;
                break;
            case TOWER:
                typeval = 19;
                break;
            case TRAININGFIELD:
                typeval = 20;
                break;
            default:
                System.err.println("Sad duck.");
                return null;
        }
        return val2al(typeval);
    }
    public static ArrayList<Integer> val2al(MapLocation loc) {
        assert(loc.x < 0xffff && loc.y < 0xffff);
        return val2al((loc.x << 16) | (0xffff & loc.y));
    }

    public static MapLocation i2ml(int i) {
        return new MapLocation(i >> 16, 0xffff & i);
    }
    public static RobotType i2rt(int enumOrd) {
        // Smells so good...
        return rt[enumOrd];
    }
    public static int d2i(Direction d) {
        switch(d) {
        case NORTH:
            return 0;
        case NORTH_EAST:
            return 1;
        case EAST:
            return 2;
        case SOUTH_EAST:
            return 3;
        case SOUTH:
            return 4;
        case SOUTH_WEST:
            return 5;
        case WEST:
            return 6;
        case NORTH_WEST:
            return 7;
        default:
            System.err.println("Sad duck.");
            return -1;
        }
    }
    public static Direction i2d(int enumOrd) {
        return directions[enumOrd];
    }
}
