class DiningPhilosophers {
 
 
    private Semaphore[] semaphores = new Semaphore[5];
 
    private Map<Integer, Semaphore[]> map = new HashMap<>();
 
    public DiningPhilosophers() {
        for (int i=0; i<5; i++) {
            semaphores[i] = new Semaphore(1);
        }
        map.put(0, new Semaphore[]{semaphores[0], semaphores[4]});
        map.put(1, new Semaphore[]{semaphores[0], semaphores[1]});
        map.put(2, new Semaphore[]{semaphores[1], semaphores[2]});
        map.put(3, new Semaphore[]{semaphores[2], semaphores[3]});
        map.put(4, new Semaphore[]{semaphores[3], semaphores[4]});
    }
 
    // call the run() method of any runnable to execute its code
    public void wantsToEat(int n,
        Runnable pickLeftFork,
        Runnable pickRightFork,
        Runnable eat,
        Runnable putLeftFork,
        Runnable putRightFork) throws InterruptedException {
        boolean locked = tryLock(n);
        while (!locked) {
            Thread.sleep(0);    ///// Interesting. Without this 'TIMED OUT' will happen.
            locked = tryLock(n);
        }
        pickLeftFork.run();
        pickRightFork.run();
        eat.run();
        putLeftFork.run();
        putRightFork.run();
        release(n);
    }
 
    private void release(int n) {
        Semaphore[] semaphores = getSemaphores(n);
        semaphores[0].release();
        semaphores[1].release();
    }
 
    // if the man can get both of the left / right focks
    private boolean tryLock(int n) {
        Semaphore[] semaphores = getSemaphores(n);
        if (semaphores[0].tryAcquire()) {
            if (semaphores[1].tryAcquire()) {
                return true;            //he can get both, return true
            } else {
                semaphores[0].release();   // can only get one, give up the one he already got
            }
        }
        return false;  // failed this time
    }
 
    private Semaphore[] getSemaphores(int n) {
        return map.get(n);
    }
}