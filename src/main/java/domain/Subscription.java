package domain;

import java.util.Date;

public class Subscription {
    private Long id;
    private Long clientId;
    private Long planId;
    private SubscriptionStatus status;
    private Date recurrenceDate;
}
