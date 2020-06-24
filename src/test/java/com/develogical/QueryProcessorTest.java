package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void plus() {
    assertThat(queryProcessor.process("what is 14 plus 14"), containsString("28"));
  }

  @Test
  public void plus2() {
    assertThat(queryProcessor.process("what is 14 plus 15"), containsString("29"));
  }

  @Test
  public void largest() {
    assertThat(queryProcessor.process("xxx: which of the following numbers is the largest: 86, 41, 947, 761"), containsString("947"));
  }

  @Test
  public void knowsWhoWroteRomeoAndJuliet() throws Exception {
    assertThat(queryProcessor.process("Who wrote Romeo And Juliet"), containsString("Shakespeare"));
  }

  @Test
  public void isNotCaseSensitive() throws Exception {
    assertThat(queryProcessor.process("who wrote romeo and juliet"), containsString("Shakespeare"));
  }

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }
}
