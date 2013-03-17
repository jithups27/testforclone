package com.example.mymail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class Mail extends Activity {
	String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
    String basepath = extStorageDirectory + "/jithu2";
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mail);

bla bla bla bla bla
bla bla bla bla bla
bla bla bla bla bla
bla bla bla bla bla
bla bla bla bla bla
bla bla bla bla bla

    
    sendBroadcast(new Intent(Intent.ACTION_MEDIA_MOUNTED, Uri
            .parse("file://"
                    + Environment.getExternalStorageDirectory())));

    File clipartdir = new File(basepath+ "/abc/");
    if (!clipartdir.exists()) {
        clipartdir.mkdirs();
      CopyAssets();     
        
        		
    }
    
}



private void CopyAssets() { 
    AssetManager assetManager = getAssets(); 
    String[] files = null; 
    try { 
        files = assetManager.list(""); 
    } catch (IOException e) { 
        Log.e("tag", e.getMessage()); 
    } 
    for(String filename : files) { 
        InputStream in = null; 
        OutputStream out = null; 
        try { 
          in = assetManager.open(filename); 
          out = new FileOutputStream(basepath + "/abc/" +filename); 
          copyFile(in, out); 
          in.close(); 
          in = null; 
          out.flush(); 
          out.close(); 
          out = null; 
        } catch(Exception e) { 
            Log.e("tag", e.getMessage()); 
        }        
    } 
} 
private void copyFile(InputStream in, OutputStream out) throws IOException { 
    byte[] buffer = new byte[1024]; 
    int read; 
    while((read = in.read(buffer)) != -1){ 
      out.write(buffer, 0, read); 
    } 
}


}









/*package com.example.mymail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Mail extends Activity {
	String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
    String basepath = extStorageDirectory + "/jithu1";
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_mail);

	    File clipartdir = new File(basepath + "/clipart/");
        if (!clipartdir.exists()) {
            clipartdir.mkdirs();
            copyClipart();      
        }

	    CopyFiles();
   
	}
	private void CopyFiles() {
		// TODO Auto-generated method stub
		private void CopyFiles(String dir) 
	    { 

	            try 
	            { 
	                    String [] filelist = am.list("samples/" + dir); 

	                    for (int count = 0; count < filelist.length; count++) 
	                    { 

	                            if (WasError == true) break; 


	                            String currfile = filelist[count]; 

	                            AssetFileDescriptor af = am.openFd("samples/" + dir + "/" + 
	currfile); 
	                              long filesize = af.getLength(); 
	                              InputStream is = am.open("samples/" + dir + "/" + currfile, 
	am.ACCESS_BUFFER); 

	                              byte [] tempdata = new byte[(int)filesize]; 

	                              is.read(tempdata); 


	                              is.close(); 

	                              if (IsNewVersion == true) 
	                              { 
	                                      File outfile = new File("/sdcard/electrum/samples/" + 
	PACK_NAME + "/" + dir,currfile); 
	                                      outfile.createNewFile(); 

	                                      FileOutputStream fo = new FileOutputStream(outfile); 
	                                      fo.write(tempdata); 
	                                      fo.close(); 
	                              } 
	                              else 
	                              { 
	                                      File outfile = new File("/sdcard/electrum/ 
	samples/",currfile); 
	                                      outfile.createNewFile(); 

	                                      FileOutputStream fo = new FileOutputStream(outfile); 
	                                      fo.write(tempdata); 
	                                      fo.close(); 

	                              } 

	                    } 


	            } 

	            catch(Exception e) 
	            { 
	                    WasError = true; 

	            ErrMessage = e.getMessage(); 

	                    PostHandler.post(ShowMsg); 
	                    PostHandler.post(DoneMsg); 

	            } 

	    } 

	}
}
	private void copyClipart() {
		// TODO Auto-generated method stub

        AssetManager assetManager = getResources().getAssets();
        String[] files = null;
        try {
            files = assetManager.list("clipart");
        } catch (Exception e) {
            Log.e("read clipart ERROR", e.toString());
            e.printStackTrace();
        }
        for(int i=0; i<files.length; i++) {
            InputStream in = null;
            OutputStream out = null;
            try {
              in = assetManager.open("clipart/" + files[i]);
              out = new FileOutputStream(basepath + "/clipart/" + files[i]);
              copyFile(in, out);
              in.close();
              in = null;
              out.flush();
              out.close();
              out = null;
            } catch(Exception e) {
                Log.e("copy clipart ERROR", e.toString());
                e.printStackTrace();
            }       
        }
    
	}
	private void copyFile(InputStream in, OutputStream out)throws IOException {
		// TODO Auto-generated method stub

        byte[] buffer = new byte[1024];
        int read;
        while((read = in.read(buffer)) != -1){
          out.write(buffer, 0, read);
        }
    
	}
}*/