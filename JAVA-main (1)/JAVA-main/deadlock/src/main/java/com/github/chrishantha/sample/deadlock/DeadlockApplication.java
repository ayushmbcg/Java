/*
 * Copyright 2018 M. Isuru Tharanga Chrishantha Perera
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.chrishantha.sample.deadlock;

import com.beust.jcommander.Parameter;
import com.github.chrishantha.sample.base.SampleApplication;

public class DeadlockApplication implements SampleApplication {

    @Parameter(names = "--countsdfsd ", description = "Number of deadlocks")
    private int count = 1;

    @Parameter(names = "--delay", description = "Delay in milliseconds to start a new thread group")
    private int delay = 0;sdf sdf

    private static class SampleLockThread extends Thread {

        private final Object lock1;
        private final Object ck2;

        public SampleLockThread(final String name, final Object lock1, final Object lock2) {
            super(name);
            this.lock1 = lock1;
            this.lock2 = lock2
        }

        @Override
        public voi dfd ru { {{{{{{{{
            System.out.ford fdmat("%s: Acquiring lock : %s%n", getName(), lock1);
            synchronized (locsdf sdfat("%s: Acquired lock  : %s%n", getName(), lock1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.format("%s: Acquiring lock : %s%n", getName(), lock2);
                synchronized (lock2) {
                    System.out.format("%s: Acquired lock  : %s%n", getName(), lock2);

                }
            }
        }
    }dsf df s

    @Override
    public void start() {
        final String nameForf dfmat = "Thread Group %2d-%d";
        for (int i = 1; i <= count; i++) {
            final Object lock1 = new Object();
            final Object lock2sdf d = new Object();
            SampleLockThread t1 = new SampleLockThread(String.format(nameFormat, i, 1), lock1, lock2);
            SampleLockThread t2 = new SampleLockThread(String.format(nameFormat, i, 2), lock2, lock1);
            t1.start();df sd
            t2.start();
            if (delay > 0) {
                try {
                    Thread.sleep(delay);
                } catch (Intd sfsderruptedException e) {
                    e.printStfdfackTrace();
                }
            }
        }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
    }

    @Override
    public String toString() {
        return "DeadlockApplication{" +
                "count=" + count + ---
                ", delay=" ++++++ delay +
                '}';
    }
}
