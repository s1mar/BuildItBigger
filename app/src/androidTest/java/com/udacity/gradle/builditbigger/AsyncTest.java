package com.udacity.gradle.builditbigger;
import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;

import Utils.EndpointsAsyncTask;

public class AsyncTest extends AndroidTestCase {


    public void testA() {
        EndpointsAsyncTask x = new EndpointsAsyncTask();
        String result="";
        try {
            result = x.execute(new Pair<Context, String>(getContext(), "Manfred")).get();
            Log.e("AsyncValue",result);


        } catch (Exception ex) {

            ex.printStackTrace();

        }
        assertNotNull(result);
    }
}
