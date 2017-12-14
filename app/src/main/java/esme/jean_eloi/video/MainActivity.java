package esme.jean_eloi.video;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vidView = (VideoView)findViewById(R.id.myVideo);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vidView.setVideoURI(vidUri);

        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);



    }

    @Override
    protected void onResume() {
        super.onResume();
        vidView.start();
       /*if (msgBLE) {
            if (vidView.isPlaying())
                vidView.pause();
            else
                vidView.resume();
        }*/

    }

    String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
    Uri vidUri = Uri.parse(vidAddress);
}
