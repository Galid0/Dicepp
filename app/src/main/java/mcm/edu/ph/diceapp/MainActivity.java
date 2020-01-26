package mcm.edu.ph.diceapp;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.media.MediaPlayer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice1;
    private ImageView imageViewDice2;
    public static final Random rng = new Random();
    private Button rolldice;
    private Timer timer = new Timer();
    private SoundPool soundPool;

    private int sound1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rolldice = (Button) findViewById(R.id.rolldice);
        imageViewDice1 = findViewById(R.id.imageView1);
        imageViewDice2 = findViewById(R.id.imageView2);

        rolldice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();

                Animation Animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                imageViewDice1.startAnimation(Animation);
                imageViewDice2.startAnimation(Animation);
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                MediaPlayer sound1= MediaPlayer.create(MainActivity.this,R.raw.sound1);
                sound1.start();
                imageViewDice1.setEnabled(false);
                imageViewDice1.setImageResource(R.drawable.dice1);
                rolldice.setEnabled(false);

                Timer buttonTimer = new Timer();
                buttonTimer.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                Toast.makeText(MainActivity.this,
                        "Hi, Im Christine",
                        Toast.LENGTH_LONG).show();
                break;
            case 2:
                MediaPlayer sound2= MediaPlayer.create(MainActivity.this,R.raw.sound1);
                sound2.start();
                imageViewDice1.setEnabled(false);
                imageViewDice1.setImageResource(R.drawable.dice2);
                rolldice.setEnabled(false);

                Timer buttonTimer2 = new Timer();
                buttonTimer2.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                Toast.makeText(MainActivity.this,
                        "GREAT!",
                        Toast.LENGTH_LONG).show();
                break;
            case 3:
                MediaPlayer sound3= MediaPlayer.create(MainActivity.this,R.raw.sound1);
                sound3.start();
                imageViewDice1.setEnabled(false);
                imageViewDice1.setImageResource(R.drawable.dice3);
                rolldice.setEnabled(false);

                Timer buttonTimer3 = new Timer();
                buttonTimer3.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                Toast.makeText(MainActivity.this,
                        "SWEET",
                        Toast.LENGTH_LONG).show();
                break;
            case 4:
                MediaPlayer sound4= MediaPlayer.create(MainActivity.this,R.raw.sound1);
                sound4.start();
                imageViewDice1.setEnabled(false);
                imageViewDice1.setImageResource(R.drawable.dice4);
                rolldice.setEnabled(false);

                Timer buttonTimer4 = new Timer();
                buttonTimer4.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                Toast.makeText(MainActivity.this,
                        "TASTY",
                        Toast.LENGTH_LONG).show();
                break;
            case 5:
                MediaPlayer sound5= MediaPlayer.create(MainActivity.this,R.raw.sound1);
                sound5.start();
                imageViewDice1.setEnabled(false);
                imageViewDice1.setImageResource(R.drawable.dice5);
                rolldice.setEnabled(false);

                Timer buttonTimer5 = new Timer();
                buttonTimer5.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                Toast.makeText(MainActivity.this,
                        "BUBBLE",
                        Toast.LENGTH_LONG).show();
                break;
            case 6:
                MediaPlayer sound6= MediaPlayer.create(MainActivity.this,R.raw.sound1);
                sound6.start();
                imageViewDice1.setEnabled(false);
                imageViewDice1.setImageResource(R.drawable.dice6);
                rolldice.setEnabled(false);

                Timer buttonTimer6 = new Timer();
                buttonTimer6.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                Toast.makeText(MainActivity.this,
                        "B",
                        Toast.LENGTH_LONG).show();
                break;
        }

        switch (randomNumber) {
            case 1:
                imageViewDice1.setEnabled(false);
                imageViewDice2.setImageResource(R.drawable.dice6);
                rolldice.setEnabled(false);

                Timer buttonTimer = new Timer();
                buttonTimer.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 2:
                imageViewDice1.setEnabled(false);
                imageViewDice2.setImageResource(R.drawable.dice5);
                rolldice.setEnabled(false);

                Timer buttonTimer2 = new Timer();
                buttonTimer2.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice4);
                rolldice.setEnabled(false);

                Timer buttonTimer3 = new Timer();
                buttonTimer3.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice3);
                rolldice.setEnabled(false);

                Timer buttonTimer4 = new Timer();
                buttonTimer4.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice2);
                rolldice.setEnabled(false);

                Timer buttonTimer5 = new Timer();
                buttonTimer5.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice1);
                rolldice.setEnabled(false);

                Timer buttonTimer6 = new Timer();
                buttonTimer6.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldice.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
        }

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //AudioAttributes audioAttributes = new AudioAttributes.Builder()
                   // .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    //.setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    //.build();

            //soundPool  = new SoundPool.Builder()
        //.setMaxStreams(1)
        //.setAudioAttributes(audioAttributes)
        //.build();
        //}else {
        //soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        //}

       // sound1 = soundPool.load(this,R.raw.sound1,1);
    //}

    //public void playSound(View v) {
        //switch (v.getId()) {
            //case R.id.rolldice:
               // soundPool.play(sound1,1,1,0,0,1);
               // break;
        //}
        //}
        //@Override
        //protected  void onDestroy() {
        //super.onDestroy();
        //soundPool.release();
        //soundPool = null;
    }
}