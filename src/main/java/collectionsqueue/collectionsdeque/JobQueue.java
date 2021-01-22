package collectionsqueue.collectionsdeque;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;

public class JobQueue {

    public Deque<Job> addJobByUrgency(Job... jobs) {
        Deque<Job> jobQue = new ArrayDeque<>();
        for (Job job : jobs) {
            if (job.isUrgent()) {
                jobQue.addFirst(job);
            } else {
                jobQue.addLast(job);
            }
        }
        return jobQue;
    }

    public Job dispatchUrgentJob(Deque<Job> jobs) throws NoJobException {
        jobsChecker(jobs);
        return jobs.getFirst();
    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) throws NoJobException {
        jobsChecker(jobs);
        return jobs.getLast();
    }


    private void jobsChecker(Deque<Job> jobs) throws NoJobException {
        if (jobs == null || jobs.isEmpty()){
            throw new NoJobException("No job available, get a rest!");
        }
    }

}
