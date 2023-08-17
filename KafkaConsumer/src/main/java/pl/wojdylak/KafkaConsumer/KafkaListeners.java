package pl.wojdylak.KafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners  {
    final String topic = "temperature";
    final String groupId = "app";
    @KafkaListener(
            topics = topic,
            groupId = groupId,
            topicPartitions = @TopicPartition(topic = topic, partitions = {"0"})
    )
    void listener0(String data){
        System.out.println("Partition 0 received: " + data);
    }
    @KafkaListener(
            topics = topic,
            groupId = groupId,
            topicPartitions = @TopicPartition(topic = topic, partitions = {"1"})

    )
    void listener1(String data){
        System.out.println("Partition 1 received: " + data);
    }
    @KafkaListener(
            topics = topic,
            groupId = groupId,
            topicPartitions = @TopicPartition(topic = topic, partitions = {"2"})

    )
    void listener2(String data){
        System.out.println("Partition 2 received: " + data);
    }
}
