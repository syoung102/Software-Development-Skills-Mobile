# Software-Development-Skills-Mobile
## Software Development Skills: Mobile

I made an application about Everland that is a famous amusement park in Korea.

It is consist of a splash screen, a main screen, and a detail screen in this app.
- You can see the Everland logo image on the splash screen.
- You can check the information about rides or go to the website on the main screen.
- You can see a picture of the rides when you click the rides.

<br>
<br>

```java
public InfoAdapter(Context c, String[] r, int[] p) {
        rides = r;
        times = new String[p.length];
        for (int i = 0; i < p.length; i++) {
            t = p[i] * 2;
            times[i] = t + " minutes";
        }
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    } 
```
The waiting time is determined by the number of people.






