// File generated from our OpenAPI spec by Stainless.

package com.openai.models.responses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseContentPartAddedEventTest {

    @Test
    fun create() {
        val responseContentPartAddedEvent =
            ResponseContentPartAddedEvent.builder()
                .contentIndex(0L)
                .itemId("item_id")
                .outputIndex(0L)
                .part(
                    ResponseOutputText.builder()
                        .addAnnotation(
                            ResponseOutputText.Annotation.FileCitation.builder()
                                .fileId("file_id")
                                .filename("filename")
                                .index(0L)
                                .build()
                        )
                        .text("text")
                        .addLogprob(
                            ResponseOutputText.Logprob.builder()
                                .token("token")
                                .addByte(0L)
                                .logprob(0.0)
                                .addTopLogprob(
                                    ResponseOutputText.Logprob.TopLogprob.builder()
                                        .token("token")
                                        .addByte(0L)
                                        .logprob(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .sequenceNumber(0L)
                .build()

        assertThat(responseContentPartAddedEvent.contentIndex()).isEqualTo(0L)
        assertThat(responseContentPartAddedEvent.itemId()).isEqualTo("item_id")
        assertThat(responseContentPartAddedEvent.outputIndex()).isEqualTo(0L)
        assertThat(responseContentPartAddedEvent.part())
            .isEqualTo(
                ResponseContentPartAddedEvent.Part.ofOutputText(
                    ResponseOutputText.builder()
                        .addAnnotation(
                            ResponseOutputText.Annotation.FileCitation.builder()
                                .fileId("file_id")
                                .filename("filename")
                                .index(0L)
                                .build()
                        )
                        .text("text")
                        .addLogprob(
                            ResponseOutputText.Logprob.builder()
                                .token("token")
                                .addByte(0L)
                                .logprob(0.0)
                                .addTopLogprob(
                                    ResponseOutputText.Logprob.TopLogprob.builder()
                                        .token("token")
                                        .addByte(0L)
                                        .logprob(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            )
        assertThat(responseContentPartAddedEvent.sequenceNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseContentPartAddedEvent =
            ResponseContentPartAddedEvent.builder()
                .contentIndex(0L)
                .itemId("item_id")
                .outputIndex(0L)
                .part(
                    ResponseOutputText.builder()
                        .addAnnotation(
                            ResponseOutputText.Annotation.FileCitation.builder()
                                .fileId("file_id")
                                .filename("filename")
                                .index(0L)
                                .build()
                        )
                        .text("text")
                        .addLogprob(
                            ResponseOutputText.Logprob.builder()
                                .token("token")
                                .addByte(0L)
                                .logprob(0.0)
                                .addTopLogprob(
                                    ResponseOutputText.Logprob.TopLogprob.builder()
                                        .token("token")
                                        .addByte(0L)
                                        .logprob(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .sequenceNumber(0L)
                .build()

        val roundtrippedResponseContentPartAddedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseContentPartAddedEvent),
                jacksonTypeRef<ResponseContentPartAddedEvent>(),
            )

        assertThat(roundtrippedResponseContentPartAddedEvent)
            .isEqualTo(responseContentPartAddedEvent)
    }
}
