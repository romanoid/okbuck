package com.uber.lint;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.ApiKt;
import com.android.tools.lint.detector.api.Issue;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class LintRegistry extends IssueRegistry {

  @Override
  public List<Issue> getIssues() {
    return ImmutableList.of(SystemCurrentTimeMillisDetector.ISSUE, ColorDetector.ISSUE);
  }

  @Override public int getApi() {
    return ApiKt.CURRENT_API;
  }
}
