package assignmentcol;

import java.util.HashMap;
    import java.util.Map;

        public class Test {

          public static void main(String[] argv) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("1","one");
            map.put("2","two");
            map.put("3","three");
            map.put("4","four");

            System.out.println(getKeyFromValue(map,"five"));
          }


// hm is the map you are trying to get value from it
          public static Object getKeyFromValue(Map hm, Object value) {
            for (Object o : hm.keySet()) {
              if (hm.get(o).equals(value)) {
                return o;
              }
            }
            return null;
          }
        }