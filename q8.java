public class GarbageCollection {

public GarbageCollection() {
System.out.println(&quot;Object created&quot;);
}

protected void finalize() throws Throwable {
System.out.println(&quot;Object deleted&quot;);
}

public class Main{
public static void main(String[] args) {

System.out.println(&quot;--- Scenario 1: Nulling Reference ---&quot;);
GarbageCollection obj1 = new GarbageCollection();
obj1 = null;

System.out.println(&quot;\n--- Scenario 2: Reassigning Reference ---&quot;);
GarbageCollection obj2 = new GarbageCollection();
GarbageCollection obj3 = new GarbageCollection();
obj2 = obj3;

System.out.println(&quot;\n--- Scenario 3: Anonymous Object ---&quot;);
new GarbageCollection();

System.out.println(&quot;\nRequesting Garbage Collection...&quot;);
System.gc();

Name: Syed Hunzala Ahmed Bukhari Section: BSE-2B Roll.no: 25K-3089

try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
