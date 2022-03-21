package com.kubek.kubeksuperduperbot.engine.misc;

import com.google.cloud.Timestamp;

import java.time.OffsetDateTime;

public class TimeManager {

    public OffsetDateTime now() { return OffsetDateTime.now(); }

    public long secondsSinceEpoch() { return OffsetDateTime.now().toEpochSecond(); }

    public Timestamp gcpTimestamp() { return Timestamp.ofTimeSecondsAndNanos(secondsSinceEpoch(), 0); }
}
