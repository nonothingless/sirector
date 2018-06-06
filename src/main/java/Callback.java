/**
 * Created by lixu on 2018/3/15.
 */

/**
 * @author:lixu
 * @date:
 * @description
 */
public interface Callback<Event> {

    public void onSuccess(Event event);

    public void onError(Event event);
}
